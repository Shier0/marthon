package marthon_sts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import marthon_sts.entity.Baseball;

/**
 * 球団情報を処理するリポジトリ
 *
 * @author Takahiro Eguchi
 *
 */
//JpaRepositoryを継承
public interface BaseballRepository extends JpaRepository<Baseball, Integer> {
}