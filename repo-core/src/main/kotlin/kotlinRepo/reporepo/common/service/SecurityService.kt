package kotlinRepo.reporepo.common.service

interface SecurityService {

    fun checkIsPasswordMatches(rawPassword: String, encodedPassword: String)

    fun encodePassword(rawPassword: String) : String
}