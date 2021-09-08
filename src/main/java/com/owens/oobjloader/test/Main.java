package com.owens.oobjloader.test;

import com.owens.oobjloader.builder.ObjBuilderImpl;
import com.owens.oobjloader.parser.ObjParser;

import java.io.IOException;
import java.util.logging.Level;

public class Main {
	public static void main(String[] args) throws IOException {
		ObjBuilderImpl builder = new ObjBuilderImpl((lvl, err) -> (lvl == Level.SEVERE ? System.err : System.out).println(err));
		ObjParser parse = new ObjParser(builder, "cube.obj");
		System.out.println(builder);
	}
}
