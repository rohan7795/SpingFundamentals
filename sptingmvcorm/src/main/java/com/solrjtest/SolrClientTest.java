package com.solrjtest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.client.solrj.impl.CloudSolrClient.Builder;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.params.MapSolrParams;

public class SolrClientTest {

	public static void main(String[] args) {

		CloudSolrClient client = new CloudSolrClient.Builder().withZkHost("localhost:9983").build();
		client.setDefaultCollection("test");

		SolrQuery sq = new SolrQuery();

		Map<String, String> queryMap = new HashMap();

		queryMap.put("q", "*:*");
		queryMap.put("fl", "id, name");
		MapSolrParams mp = new MapSolrParams(queryMap);
		Object o = new Object();

		try {
			QueryResponse response = client.query("test", mp);

			SolrDocumentList results = response.getResults();

			System.out.println("result mile");

			for (SolrDocument sd : results) {
				System.out.println(sd.getFirstValue("id"));
				System.out.println(sd.getFirstValue("name"));
			}

		} catch (SolrServerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
