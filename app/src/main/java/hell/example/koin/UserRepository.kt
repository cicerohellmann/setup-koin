package hell.example.koin

interface UserRepository {
    fun findUser(name : String): User?
    fun addUsers(users : List<User>)
}
