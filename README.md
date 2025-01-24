# Kotlin map() on Empty List

This example demonstrates the behavior of Kotlin's `map()` function when applied to an empty list.  The function correctly returns an empty list, but this may be surprising to developers unfamiliar with functional programming.  The provided solution explains this behavior and offers ways to handle potential edge cases.

**Bug:** The `map()` operation on an empty list might be unexpectedly silent. No exception or special value is returned, and the result is an empty list. This can cause a hidden bug if it's not handled.