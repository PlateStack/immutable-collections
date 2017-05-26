[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableNavigableSet](index.md) / [higher](.)

# higher

`abstract fun higher(e: E): E?` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableNavigableSet.kt#L99)

Returns the least element in this set strictly greater than the
given element, or `null` if there is no such element.

### Parameters

`e` - the value to match

### Exceptions

`ClassCastException` - if the specified element cannot be
    compared with the elements currently in the set

`NullPointerException` - if the specified element is null
    and this set does not permit null elements

**Return**
the least element greater than `e`,
    or `null` if there is no such element

