package com.mirhoseini.marvel.character.cache;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Mohsen on 20/10/2016.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
@interface Cache {
}
