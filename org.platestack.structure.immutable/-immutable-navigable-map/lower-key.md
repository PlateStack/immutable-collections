[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableNavigableMap](index.md) / [lowerKey](.)

# lowerKey

`abstract fun lowerKey(key: K): K?`

Returns the greatest key strictly less than the given key, or
`null` if there is no such key.

### Parameters

`key` - the key

### Exceptions

`ClassCastException` - if the specified key cannot be compared
    with the keys currently in the map

`NullPointerException` - if the specified key is null
    and this map does not permit null keys

**Return**
the greatest key less than `key`,
    or `null` if there is no such key

