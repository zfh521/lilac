package org.hibernate.envers.event;

import org.hibernate.cfg.Configuration;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.envers.configuration.AuditConfiguration;
import org.hibernate.event.service.spi.EventListenerRegistry;
import org.hibernate.event.spi.EventType;
import org.hibernate.integrator.spi.Integrator;
import org.hibernate.metamodel.source.MetadataImplementor;
import org.hibernate.service.classloading.spi.ClassLoaderService;
import org.hibernate.service.spi.SessionFactoryServiceRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author andy
 * @since 2013-5-15
 */
public class CustomEnversIntegrator implements Integrator {

    private static final Logger log = LoggerFactory.getLogger(CustomEnversIntegrator.class);

    /*
     * (non-Javadoc)
     * @see org.hibernate.integrator.spi.Integrator#integrate(org.hibernate.cfg.Configuration,
     * org.hibernate.engine.spi.SessionFactoryImplementor, org.hibernate.service.spi.SessionFactoryServiceRegistry)
     */
    @Override
    public void integrate(Configuration configuration, SessionFactoryImplementor sessionFactory,
                          SessionFactoryServiceRegistry serviceRegistry) {
        EventListenerRegistry listenerRegistry = serviceRegistry.getService(EventListenerRegistry.class);
        listenerRegistry.addDuplicationStrategy(EnversListenerDuplicationStrategy.INSTANCE);

        final AuditConfiguration enversConfiguration = AuditConfiguration.getFor(configuration,
                                                                                 serviceRegistry.getService(ClassLoaderService.class));

        if (enversConfiguration.getEntCfg().hasAuditedEntities()) {
            listenerRegistry.appendListeners(EventType.POST_DELETE,
                                             new EnversPostDeleteEventListenerImpl(enversConfiguration));
            listenerRegistry.appendListeners(EventType.POST_INSERT,
                                             new EnversPostInsertEventListenerImpl(enversConfiguration));
            listenerRegistry.appendListeners(EventType.POST_UPDATE,
                                             new EnversPostUpdateEventListenerImpl(enversConfiguration));
            listenerRegistry.appendListeners(EventType.POST_COLLECTION_RECREATE,
                                             new EnversPostCollectionRecreateEventListenerImpl(enversConfiguration));
            listenerRegistry.appendListeners(EventType.PRE_COLLECTION_REMOVE,
                                             new EnversPreCollectionRemoveEventListenerImpl(enversConfiguration));
            listenerRegistry.appendListeners(EventType.PRE_COLLECTION_UPDATE,
                                             new EnversPreCollectionUpdateEventListenerImpl(enversConfiguration));
        }
        log.info("register event listeners completed");
    }

    /*
     * (non-Javadoc)
     * @see org.hibernate.integrator.spi.Integrator#integrate(org.hibernate.metamodel.source.MetadataImplementor,
     * org.hibernate.engine.spi.SessionFactoryImplementor, org.hibernate.service.spi.SessionFactoryServiceRegistry)
     */
    @Override
    public void integrate(MetadataImplementor metadata, SessionFactoryImplementor sessionFactory,
                          SessionFactoryServiceRegistry serviceRegistry) {
    }

    /*
     * (non-Javadoc)
     * @see org.hibernate.integrator.spi.Integrator#disintegrate(org.hibernate.engine.spi.SessionFactoryImplementor,
     * org.hibernate.service.spi.SessionFactoryServiceRegistry)
     */
    @Override
    public void disintegrate(SessionFactoryImplementor sessionFactory, SessionFactoryServiceRegistry serviceRegistry) {
    }

}
