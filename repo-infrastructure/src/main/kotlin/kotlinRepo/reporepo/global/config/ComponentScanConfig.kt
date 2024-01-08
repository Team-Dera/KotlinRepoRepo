package kotlinRepo.reporepo.global.config

import kotlinRepo.reporepo.common.annotation.ReadOnlyUseCase
import kotlinRepo.reporepo.common.annotation.Service
import kotlinRepo.reporepo.common.annotation.UseCase
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ComponentScan.Filter
import org.springframework.context.annotation.FilterType

@Configuration
@ComponentScan(
    basePackages = ["kotlinRepo.reporepo"],
    includeFilters = [
        Filter(
            type = FilterType.ANNOTATION,
            classes = [
                UseCase::class,
                ReadOnlyUseCase::class,
                Service::class

            ]
        )
    ]
)
class ComponentScanConfig
