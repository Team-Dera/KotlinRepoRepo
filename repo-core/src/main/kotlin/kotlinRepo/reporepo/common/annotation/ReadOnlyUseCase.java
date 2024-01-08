package kotlinRepo.reporepo.common.annotation;

import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import org.springframework.transaction.annotation.Transactional;

@Retention(AnnotationRetention.RUNTIME)
@Target(allowedTargets = AnnotationTarget.CLASS)
@Transactional(readOnly = true)
public @interface ReadOnlyUseCase {
}
