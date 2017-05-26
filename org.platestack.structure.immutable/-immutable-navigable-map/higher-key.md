[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableNavigableMap](index.md) / [higherKey](.)

# higherKey

`abstract fun higherKey(key: K): K?`

Returns the least key strictly greater than the given key, or
`null` if there is no such key.

### Parameters

`key` - the key

### Exceptions

`ClassCastException` - if the specified key cannot be compared
    with the keys currently in the map

`NullPointerException` - if the specified key is null
    and this map does not permit null keys

**Return**
the least key greater than `key`,
    or `null` if there is no such key
