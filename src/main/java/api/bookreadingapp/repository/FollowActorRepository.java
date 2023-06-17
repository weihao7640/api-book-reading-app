package api.bookreadingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import api.bookreadingapp.model.FollowActorEntity;

public interface FollowActorRepository extends JpaRepository<FollowActorEntity, Integer>  {
	@Query(value="select * from [FOLLOW_ACTOR]", nativeQuery = true)
	public List<FollowActorEntity> getAll();
	
	@Query(value="select * from [FOLLOW_ACTOR] where id_actor=?1",nativeQuery = true)
	public List<FollowActorEntity> getUserFollowActor(int id_actor);
	
	@Query(value="select * from [FOLLOW_ACTOR] where id_user=?1",nativeQuery = true)
	public List<FollowActorEntity> getActorFollowOfUser(int id_user);

}
