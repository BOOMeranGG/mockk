package io.mockk.impl.recording

import io.mockk.MethodDescription

object WasNotCalled {
    val method = MethodDescription(
        "wasNot Called",
        Unit::class,
        false,
        true,
        false,
        false,
        false,
        Unit::class,
        listOf(),
        -1,
        false
    )
}
