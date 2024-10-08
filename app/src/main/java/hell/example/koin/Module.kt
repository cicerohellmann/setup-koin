package hell.example.koin

import org.koin.dsl.module

val appModule = module {
    single<UserRepository> { UserRepositoryImpl() }
    factory { UserPresenter(get()) }
}

