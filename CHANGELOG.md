# Change Log
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/)
and this project adheres to [Semantic Versioning](http://semver.org/).

## [Unreleased]
### Added
- Builders to all immutable interfaces
- toMutable() to all immutable interfaces
- Modification extension functions which returns a new immutable copy with the modifications

### Fixed
- Some immutable maps and sorted sets were not serializable

## [0.1.0-alpha] - 2017-05-26
### Implements
- Immutable API for:
  - Map (linked)
  - HashMap
  - SortedMap
  - NavigableMap
  - Collection
  - List
  - Set (linked)
  - HashSet
  - SortedSet
  - NavigableSet

[Unreleased]: https://github.com/PlateStack/immutable-collections/compare/v0.1.0-alpha...HEAD
[0.1.0-alpha]: https://github.com/PlateStack/immutable-collections/compare/v0.0.0...v0.1.0-alpha
