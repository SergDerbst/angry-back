package de.tmt.angry.persistence;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class CrudDaoService<Repo extends JpaRepository<Entity, ID>, Entity, ID extends Serializable> implements
CrudDao<Entity, ID> {

	public abstract Repo getRepository();

	@Override
	public Entity save(final Entity entity) {
		return this.getRepository().save(entity);
	}

	@Override
	public Entity readById(final ID id) {
		return this.getRepository().findOne(id);
	}

	@Override
	public List<Entity> readAll() {
		return this.getRepository().findAll();
	}

	@Override
	public Entity create(final Entity entity) {
		return this.getRepository().save(entity);
	}

	@Override
	public List<Entity> createAll(final List<Entity> entities) {
		return this.getRepository().save(entities);
	}

	@Override
	public void delete(final ID id) {
		this.getRepository().delete(id);
	}

	@Override
	public boolean exists(final ID id) {
		return this.getRepository().exists(id);
	}

	@Override
	public long count() {
		return this.getRepository().count();
	}
}
