package kotlinRepo.reporepo.domain.user.service

import kotlinRepo.reporepo.common.annotation.Service

@Service
class UserService(
    checkUserService: CheckUserService,
    getUserService: GetUserService,
    commandUserService: CommandUserService
) : CheckUserService by checkUserService,
    GetUserService by getUserService,
    CommandUserService by commandUserService
