/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.mgh.edd.app;

import com.mgh.edd.list.LinkedList;

import static com.mgh.edd.utilities.StringUtils.join;
import static com.mgh.edd.utilities.StringUtils.split;
import static com.mgh.edd.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
