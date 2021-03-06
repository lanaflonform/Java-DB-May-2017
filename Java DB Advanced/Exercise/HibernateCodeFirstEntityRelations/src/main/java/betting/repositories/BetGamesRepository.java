package betting.repositories;

import betting.entities.BetGames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BetGamesRepository extends JpaRepository<BetGames, Long> {
}
