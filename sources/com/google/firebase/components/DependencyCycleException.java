package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;
import k8.c;

/* loaded from: classes3.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: f  reason: collision with root package name */
    private final List<c<?>> f11279f;

    public DependencyCycleException(List<c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f11279f = list;
    }
}
