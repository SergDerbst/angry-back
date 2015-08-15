package de.tmt.angry.commons.exceptions.persistence.impl;

import de.tmt.angry.commons.exceptions.persistence.PersistenceRuntimeException;

@SuppressWarnings("serial")
public class EntityNotFoundInDatabaseException extends PersistenceRuntimeException {

	public static EntityNotFoundInDatabaseException prepare(final Object entity) {
		return (EntityNotFoundInDatabaseException) new EntityNotFoundInDatabaseException().addContextValue("entity", entity);
	}
}
