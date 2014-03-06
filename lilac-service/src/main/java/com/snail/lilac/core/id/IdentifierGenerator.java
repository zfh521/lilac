package com.snail.lilac.core.id;

import java.io.Serializable;

import com.snail.lilac.core.RepositoryException;

/**
 * @author andy
 */
public interface IdentifierGenerator {

    public Serializable generate() throws RepositoryException;
}
