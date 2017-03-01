package com.sksamuel.elastic4s.http.search.aggs

import com.sksamuel.elastic4s.searches.aggs._
import org.elasticsearch.common.xcontent.XContentBuilder

object AggregationBuilderFn {
  def apply(agg: AggregationDefinition): XContentBuilder = agg match {
    case agg: TermsAggregationDefinition => TermsAggregationBuilder(agg)
    case agg: SumAggregationDefinition => SumAggregationBuilder(agg)
    case agg: MaxAggregationDefinition => MaxAggregationBuilder(agg)
    case agg: MinAggregationDefinition => MinAggregationBuilder(agg)
  }
}
