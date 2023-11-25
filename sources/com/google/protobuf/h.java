package com.google.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* compiled from: ByteString.java */
/* loaded from: classes3.dex */
public abstract class h implements Iterable<Byte>, Serializable {

    /* renamed from: m  reason: collision with root package name */
    public static final h f12293m = new j(z.f12482c);

    /* renamed from: p  reason: collision with root package name */
    private static final f f12294p;

    /* renamed from: q  reason: collision with root package name */
    private static final Comparator<h> f12295q;

    /* renamed from: f  reason: collision with root package name */
    private int f12296f = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ByteString.java */
    /* loaded from: classes3.dex */
    public class a extends c {

        /* renamed from: f  reason: collision with root package name */
        private int f12297f = 0;

        /* renamed from: m  reason: collision with root package name */
        private final int f12298m;

        a() {
            this.f12298m = h.this.size();
        }

        @Override // com.google.protobuf.h.g
        public byte b() {
            int i10 = this.f12297f;
            if (i10 < this.f12298m) {
                this.f12297f = i10 + 1;
                return h.this.k(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12297f < this.f12298m) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes3.dex */
    static class b implements Comparator<h> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(h hVar, h hVar2) {
            g it = hVar.iterator();
            g it2 = hVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(h.u(it.b()), h.u(it2.b()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(hVar.size(), hVar2.size());
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes3.dex */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes3.dex */
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.protobuf.h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteString.java */
    /* loaded from: classes3.dex */
    public static final class e extends j {

        /* renamed from: s  reason: collision with root package name */
        private final int f12300s;

        /* renamed from: t  reason: collision with root package name */
        private final int f12301t;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            h.g(i10, i10 + i11, bArr.length);
            this.f12300s = i10;
            this.f12301t = i11;
        }

        @Override // com.google.protobuf.h.j
        protected int F() {
            return this.f12300s;
        }

        @Override // com.google.protobuf.h.j, com.google.protobuf.h
        public byte e(int i10) {
            h.f(i10, size());
            return this.f12304r[this.f12300s + i10];
        }

        @Override // com.google.protobuf.h.j, com.google.protobuf.h
        protected void j(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f12304r, F() + i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.h.j, com.google.protobuf.h
        byte k(int i10) {
            return this.f12304r[this.f12300s + i10];
        }

        @Override // com.google.protobuf.h.j, com.google.protobuf.h
        public int size() {
            return this.f12301t;
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes3.dex */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes3.dex */
    public interface g extends Iterator<Byte> {
        byte b();
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.h$h  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0256h {

        /* renamed from: a  reason: collision with root package name */
        private final CodedOutputStream f12302a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f12303b;

        /* synthetic */ C0256h(int i10, a aVar) {
            this(i10);
        }

        public h a() {
            this.f12302a.c();
            return new j(this.f12303b);
        }

        public CodedOutputStream b() {
            return this.f12302a;
        }

        private C0256h(int i10) {
            byte[] bArr = new byte[i10];
            this.f12303b = bArr;
            this.f12302a = CodedOutputStream.d0(bArr);
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes3.dex */
    static abstract class i extends h {
        i() {
        }

        @Override // com.google.protobuf.h, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes3.dex */
    private static class j extends i {

        /* renamed from: r  reason: collision with root package name */
        protected final byte[] f12304r;

        j(byte[] bArr) {
            bArr.getClass();
            this.f12304r = bArr;
        }

        @Override // com.google.protobuf.h
        final void D(com.google.protobuf.g gVar) throws IOException {
            gVar.a(this.f12304r, F(), size());
        }

        final boolean E(h hVar, int i10, int i11) {
            if (i11 <= hVar.size()) {
                int i12 = i10 + i11;
                if (i12 <= hVar.size()) {
                    if (hVar instanceof j) {
                        j jVar = (j) hVar;
                        byte[] bArr = this.f12304r;
                        byte[] bArr2 = jVar.f12304r;
                        int F = F() + i11;
                        int F2 = F();
                        int F3 = jVar.F() + i10;
                        while (F2 < F) {
                            if (bArr[F2] != bArr2[F3]) {
                                return false;
                            }
                            F2++;
                            F3++;
                        }
                        return true;
                    }
                    return hVar.s(i10, i12).equals(s(0, i11));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + hVar.size());
            }
            throw new IllegalArgumentException("Length too large: " + i11 + size());
        }

        protected int F() {
            return 0;
        }

        @Override // com.google.protobuf.h
        public byte e(int i10) {
            return this.f12304r[i10];
        }

        @Override // com.google.protobuf.h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h) || size() != ((h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                int r10 = r();
                int r11 = jVar.r();
                if (r10 != 0 && r11 != 0 && r10 != r11) {
                    return false;
                }
                return E(jVar, 0, size());
            }
            return obj.equals(this);
        }

        @Override // com.google.protobuf.h
        protected void j(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f12304r, i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.h
        byte k(int i10) {
            return this.f12304r[i10];
        }

        @Override // com.google.protobuf.h
        public final boolean l() {
            int F = F();
            return q1.n(this.f12304r, F, size() + F);
        }

        @Override // com.google.protobuf.h
        public final com.google.protobuf.i o() {
            return com.google.protobuf.i.h(this.f12304r, F(), size(), true);
        }

        @Override // com.google.protobuf.h
        protected final int p(int i10, int i11, int i12) {
            return z.i(i10, this.f12304r, F() + i11, i12);
        }

        @Override // com.google.protobuf.h
        public final h s(int i10, int i11) {
            int g10 = h.g(i10, i11, size());
            if (g10 == 0) {
                return h.f12293m;
            }
            return new e(this.f12304r, F() + i10, g10);
        }

        @Override // com.google.protobuf.h
        public int size() {
            return this.f12304r.length;
        }

        @Override // com.google.protobuf.h
        protected final String w(Charset charset) {
            return new String(this.f12304r, F(), size(), charset);
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes3.dex */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.protobuf.h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f dVar;
        a aVar = null;
        if (com.google.protobuf.d.c()) {
            dVar = new k(aVar);
        } else {
            dVar = new d(aVar);
        }
        f12294p = dVar;
        f12295q = new b();
    }

    h() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h A(byte[] bArr) {
        return new j(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h C(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    static void f(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int g(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 >= 0) {
                if (i11 < i10) {
                    throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
                }
                throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
            }
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        return i13;
    }

    public static h h(byte[] bArr, int i10, int i11) {
        g(i10, i10 + i11, bArr.length);
        return new j(f12294p.a(bArr, i10, i11));
    }

    public static h i(String str) {
        return new j(str.getBytes(z.f12480a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0256h n(int i10) {
        return new C0256h(i10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int u(byte b10) {
        return b10 & 255;
    }

    private String y() {
        if (size() <= 50) {
            return k1.a(this);
        }
        return k1.a(s(0, 47)) + "...";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void D(com.google.protobuf.g gVar) throws IOException;

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f12296f;
        if (i10 == 0) {
            int size = size();
            i10 = p(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f12296f = i10;
        }
        return i10;
    }

    protected abstract void j(byte[] bArr, int i10, int i11, int i12);

    abstract byte k(int i10);

    public abstract boolean l();

    @Override // java.lang.Iterable
    /* renamed from: m  reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    public abstract com.google.protobuf.i o();

    protected abstract int p(int i10, int i11, int i12);

    protected final int r() {
        return this.f12296f;
    }

    public abstract h s(int i10, int i11);

    public abstract int size();

    public final byte[] t() {
        int size = size();
        if (size == 0) {
            return z.f12482c;
        }
        byte[] bArr = new byte[size];
        j(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), y());
    }

    public final String v(Charset charset) {
        if (size() == 0) {
            return "";
        }
        return w(charset);
    }

    protected abstract String w(Charset charset);

    public final String x() {
        return v(z.f12480a);
    }
}
