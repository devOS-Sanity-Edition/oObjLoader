package com.owens.oobjloader.test;

import com.owens.oobjloader.builder.ObjBuilderImpl;
import com.owens.oobjloader.parser.ObjParser;
import org.apache.logging.log4j.LogManager;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		ObjBuilderImpl builder = new ObjBuilderImpl(LogManager.getLogger("Test Parse"));
		ObjParser parse = new ObjParser(builder, "cube.obj");
		System.out.println(builder);
	}
}
