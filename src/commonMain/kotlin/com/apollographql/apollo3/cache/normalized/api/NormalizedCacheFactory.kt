package com.apollographql.apollo3.cache.normalized.api

abstract class NormalizedCacheFactory {
  abstract fun create(): NormalizedCache
}
