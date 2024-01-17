package kotlinRepo.reporepo.domain.user.service

interface CheckUserService {

    fun checkUserExistsByAccountId(accountId: String)

}