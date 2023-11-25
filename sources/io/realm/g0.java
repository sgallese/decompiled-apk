package io.realm;

import java.util.Locale;

/* compiled from: OrderedCollectionChangeSet.java */
/* loaded from: classes4.dex */
public interface g0 {

    /* compiled from: OrderedCollectionChangeSet.java */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f17522a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17523b;

        public a(int i10, int i11) {
            this.f17522a = i10;
            this.f17523b = i11;
        }

        public String toString() {
            return String.format(Locale.ENGLISH, "startIndex: %d, length: %d", Integer.valueOf(this.f17522a), Integer.valueOf(this.f17523b));
        }
    }

    /* compiled from: OrderedCollectionChangeSet.java */
    /* loaded from: classes4.dex */
    public enum b {
        INITIAL,
        UPDATE,
        ERROR
    }
}
