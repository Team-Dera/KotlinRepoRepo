package kotlinRepo.reporepo.persistence.auth.repository

import kotlinRepo.reporepo.domain.auth.model.RefreshToken
import kotlinRepo.reporepo.persistence.auth.entity.RefreshTokenEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RefreshTokenRepository : CrudRepository<RefreshTokenEntity, String>