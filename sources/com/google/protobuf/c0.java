package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField.java */
/* loaded from: classes3.dex */
public class c0 extends d0 {

    /* renamed from: f  reason: collision with root package name */
    private final q0 f12258f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyField.java */
    /* loaded from: classes3.dex */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: f  reason: collision with root package name */
        private Map.Entry<K, c0> f12259f;

        public c0 a() {
            return this.f12259f.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f12259f.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            c0 value = this.f12259f.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof q0) {
                return this.f12259f.getValue().d((q0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, c0> entry) {
            this.f12259f = entry;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyField.java */
    /* loaded from: classes3.dex */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: f  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f12260f;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f12260f = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f12260f.next();
            if (next.getValue() instanceof c0) {
                return new b(next);
            }
            return next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12260f.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f12260f.remove();
        }
    }

    @Override // com.google.protobuf.d0
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public q0 f() {
        return c(this.f12258f);
    }

    @Override // com.google.protobuf.d0
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
