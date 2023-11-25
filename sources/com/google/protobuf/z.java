package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Internal.java */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f12480a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f12481b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f12482c;

    /* renamed from: d  reason: collision with root package name */
    public static final ByteBuffer f12483d;

    /* renamed from: e  reason: collision with root package name */
    public static final com.google.protobuf.i f12484e;

    /* compiled from: Internal.java */
    /* loaded from: classes3.dex */
    public interface a extends i<Boolean> {
    }

    /* compiled from: Internal.java */
    /* loaded from: classes3.dex */
    public interface b extends i<Double> {
    }

    /* compiled from: Internal.java */
    /* loaded from: classes3.dex */
    public interface c {
        int getNumber();
    }

    /* compiled from: Internal.java */
    /* loaded from: classes3.dex */
    public interface d<T extends c> {
        T a(int i10);
    }

    /* compiled from: Internal.java */
    /* loaded from: classes3.dex */
    public interface e {
        boolean a(int i10);
    }

    /* compiled from: Internal.java */
    /* loaded from: classes3.dex */
    public interface f extends i<Float> {
    }

    /* compiled from: Internal.java */
    /* loaded from: classes3.dex */
    public interface g extends i<Integer> {
        @Override // com.google.protobuf.z.i
        i<Integer> b(int i10);

        int getInt(int i10);

        void q(int i10);
    }

    /* compiled from: Internal.java */
    /* loaded from: classes3.dex */
    public interface h extends i<Long> {
    }

    /* compiled from: Internal.java */
    /* loaded from: classes3.dex */
    public interface i<E> extends List<E>, RandomAccess {
        boolean R0();

        i<E> b(int i10);

        void c();
    }

    static {
        byte[] bArr = new byte[0];
        f12482c = bArr;
        f12483d = ByteBuffer.wrap(bArr);
        f12484e = com.google.protobuf.i.f(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(T t10) {
        t10.getClass();
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T b(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        if (z10) {
            return 1231;
        }
        return 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return q1.m(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object h(Object obj, Object obj2) {
        return ((q0) obj).d().m((q0) obj2).x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f12480a);
    }
}
