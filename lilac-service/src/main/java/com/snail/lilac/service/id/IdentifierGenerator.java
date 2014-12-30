package com.snail.lilac.service.id;

import java.io.Serializable;

import com.snail.lilac.RepositoryException;

/**
 * @author Andy
 */
public interface IdentifierGenerator {

    public Serializable generate() throws RepositoryException;
}
