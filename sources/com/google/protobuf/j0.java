package com.google.protobuf;

import com.google.protobuf.r1;
import java.io.IOException;

/* compiled from: MapEntryLite.java */
/* loaded from: classes3.dex */
public class j0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final a<K, V> f12355a;

    /* renamed from: b  reason: collision with root package name */
    private final K f12356b;

    /* renamed from: c  reason: collision with root package name */
    private final V f12357c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapEntryLite.java */
    /* loaded from: classes3.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final r1.b f12358a;

        /* renamed from: b  reason: collision with root package name */
        public final K f12359b;

        /* renamed from: c  reason: collision with root package name */
        public final r1.b f12360c;

        /* renamed from: d  reason: collision with root package name */
        public final V f12361d;

        public a(r1.b bVar, K k10, r1.b bVar2, V v10) {
            this.f12358a = bVar;
            this.f12359b = k10;
            this.f12360c = bVar2;
            this.f12361d = v10;
        }
    }

    private j0(r1.b bVar, K k10, r1.b bVar2, V v10) {
        this.f12355a = new a<>(bVar, k10, bVar2, v10);
        this.f12356b = k10;
        this.f12357c = v10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return t.d(aVar.f12358a, 1, k10) + t.d(aVar.f12360c, 2, v10);
    }

    public static <K, V> j0<K, V> d(r1.b bVar, K k10, r1.b bVar2, V v10) {
        return new j0<>(bVar, k10, bVar2, v10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k10, V v10) throws IOException {
        t.z(codedOutputStream, aVar.f12358a, 1, k10);
        t.z(codedOutputStream, aVar.f12360c, 2, v10);
    }

    public int a(int i10, K k10, V v10) {
        return CodedOutputStream.U(i10) + CodedOutputStream.C(b(this.f12355a, k10, v10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a<K, V> c() {
        return this.f12355a;
    }
}
