package com.video.CLanguage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Document;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		/*
		 * List<String> url=new ArrayList(); url.add(
		 * "https://www.bilibili.com/video/BV1TW411e7M9?from=search&seid=7151748216605853336"
		 * ); <meta data-vue-meta="true" itemprop="url"
		 * content="https://www.bilibili.com/video/av18681411/"> #multi_page >
		 * div.cur-list > ul #multi_page > div.cur-list > ul > li.watched.on > a
		 * <a href="/video/BV1TW411e7M9?p=4" class="" title="004第二章 数据类型，运算符和表达式03"><i class="van-icon-videodetails_play" style="display: none;"></i><span class="s1">P4</span>004第二章 数据类型，运算符和表达式03
        </a>
		 * #multi_page > div.cur-list > ul > li:nth-child(2) > a #multi_page >
		 * div.cur-list > ul > li:nth-child(3) > a
		 * <a href="/video/BV1TW411e7M9?p=1" class="" title="001第一章 C语言概述以及如何上机运行C 新版"><i class="van-icon-videodetails_play"></i><span class="s1">P1</span>001第一章 C语言概述以及如何上机运行C 新版
		 *<a href="/video/BV1TW411e7M9?p=2" class="" title="002第二章 数据类型，运算符和表达式01"><i class="van-icon-videodetails_play" style="display: none;"></i><span class="s1">P2</span>002第二章 数据类型，运算符和表达式01
        </a><a href="/video/BV1TW411e7M9?p=3" class="" title="003第二章 数据类型，运算符和表达式02"><i class="van-icon-videodetails_play" style="display: none;"></i><span class="s1">P3</span>003第二章 数据类型，运算符和表达式02
        </a>/
		org.jsoup.nodes.Document document = Jsoup
				.connect("https://www.bilibili.com/video/BV1TW411e7M9?from=search&seid=7151748216605853336").get();
		Elements a=document.getElementsByTag("a");
		System.out.println(a.attr("href"));
		Elements curlist = document.getElementsByClass("cur-list");
		System.out.println(curlist.attr("ul"));
		
	    Elements select=document.select("#div.cur-list > ul > li > a");
		  
		/*
		 * FileWriter writer=new FileWriter(new File("D:\\CVideo.csv")); BufferedWriter
		 * buffer=new BufferedWriter(writer);
		 */
		  
		/*
		 * System.out.println(select.text()+"123"); for(Element element:select) {
		 * System.out.println(element.attr("href"));
		 * System.out.println(element.attr("title")); }
		 */
		org.jsoup.nodes.Document document = Jsoup
				.connect("https://www.bilibili.com/video/BV1hb411q7Zp/?spm_id_from=333.788.videocard.10").get();
		System.out.println(document);
		/*
		 * Elements a=document.getElementsByTag("a"); for(Element c:a) {
		 * System.out.println(c.attr("href")+"\n");
		 * System.out.println(c.attr("title")+"\n"); }
		 */
//		Elements curlist = document.getElementsByClass("cur-list");
//		System.out.println(curlist.attr("ul"));
		/*
		 * Elements select=document.select("#div.cur-list > ul > li > a");
		 * System.out.println(select.text()+"123"); for(Element element:select) {
		 * System.out.println(element.attr("href"));
		 * System.out.println(element.attr("title")); }
		 */
		/*
		 * Elements c=document.getElementsByTag("li"); for(Element a:c) {
		 * System.out.println(a.attr("a")); }
		 */
	}
}
