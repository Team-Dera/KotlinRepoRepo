package kotlinRepo.reporepo.domain.user.service

class CheckUserServiceImpl {
        if(queryUserPort.existUserByAccountId(accountId)) {
            throw UserAccountIdExistsException
}