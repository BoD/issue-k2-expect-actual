package com.apollographql.apollo3.cache.normalized.sql

import com.apollographql.apollo3.cache.normalized.api.NormalizedCacheFactory

actual class SqlNormalizedCacheFactory() : NormalizedCacheFactory() {
  override fun create(): SqlNormalizedCache {
    return SqlNormalizedCache()
  }
}
