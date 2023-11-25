package org.bson.types;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import md.a;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes4.dex */
public final class ObjectId implements Comparable<ObjectId>, Serializable {

    /* renamed from: r  reason: collision with root package name */
    private static final int f20715r;

    /* renamed from: s  reason: collision with root package name */
    private static final short f20716s;

    /* renamed from: t  reason: collision with root package name */
    private static final AtomicInteger f20717t = new AtomicInteger(new SecureRandom().nextInt());

    /* renamed from: u  reason: collision with root package name */
    private static final char[] f20718u = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: f  reason: collision with root package name */
    private final int f20719f;

    /* renamed from: m  reason: collision with root package name */
    private final int f20720m;

    /* renamed from: p  reason: collision with root package name */
    private final int f20721p;

    /* renamed from: q  reason: collision with root package name */
    private final short f20722q;

    static {
        try {
            SecureRandom secureRandom = new SecureRandom();
            f20715r = secureRandom.nextInt(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            f20716s = (short) secureRandom.nextInt(32768);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public ObjectId() {
        this(new Date());
    }

    private static int d(Date date) {
        return (int) (date.getTime() / 1000);
    }

    private static byte f(int i10) {
        return (byte) i10;
    }

    private static byte g(int i10) {
        return (byte) (i10 >> 8);
    }

    private static byte i(int i10) {
        return (byte) (i10 >> 16);
    }

    private static byte j(int i10) {
        return (byte) (i10 >> 24);
    }

    public static boolean k(String str) {
        if (str != null) {
            int length = str.length();
            if (length != 24) {
                return false;
            }
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && (charAt < 'A' || charAt > 'F'))) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    private static byte[] l(int i10, int i11, int i12) {
        return new byte[]{j(i10), i(i10), g(i10), f(i10), j(i11), i(i11), g(i11), f(i11), j(i12), i(i12), g(i12), f(i12)};
    }

    private static int m(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    private static short n(byte b10, byte b11) {
        return (short) (((b10 & 255) << 8) | (b11 & 255));
    }

    private static byte[] o(String str) {
        if (k(str)) {
            byte[] bArr = new byte[12];
            for (int i10 = 0; i10 < 12; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) Integer.parseInt(str.substring(i11, i11 + 2), 16);
            }
            return bArr;
        }
        throw new IllegalArgumentException("invalid hexadecimal representation of an ObjectId: [" + str + "]");
    }

    private static byte q(short s10) {
        return (byte) s10;
    }

    private static byte r(short s10) {
        return (byte) (s10 >> 8);
    }

    @Override // java.lang.Comparable
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public int compareTo(ObjectId objectId) {
        objectId.getClass();
        byte[] s10 = s();
        byte[] s11 = objectId.s();
        for (int i10 = 0; i10 < 12; i10++) {
            byte b10 = s10[i10];
            byte b11 = s11[i10];
            if (b10 != b11) {
                if ((b10 & 255) < (b11 & 255)) {
                    return -1;
                }
                return 1;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ObjectId.class != obj.getClass()) {
            return false;
        }
        ObjectId objectId = (ObjectId) obj;
        if (this.f20720m == objectId.f20720m && this.f20719f == objectId.f20719f && this.f20721p == objectId.f20721p && this.f20722q == objectId.f20722q) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f20719f * 31) + this.f20720m) * 31) + this.f20721p) * 31) + this.f20722q;
    }

    public void p(ByteBuffer byteBuffer) {
        boolean z10;
        a.c("buffer", byteBuffer);
        if (byteBuffer.remaining() >= 12) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.b("buffer.remaining() >=12", z10);
        byteBuffer.put(j(this.f20719f));
        byteBuffer.put(i(this.f20719f));
        byteBuffer.put(g(this.f20719f));
        byteBuffer.put(f(this.f20719f));
        byteBuffer.put(i(this.f20721p));
        byteBuffer.put(g(this.f20721p));
        byteBuffer.put(f(this.f20721p));
        byteBuffer.put(r(this.f20722q));
        byteBuffer.put(q(this.f20722q));
        byteBuffer.put(i(this.f20720m));
        byteBuffer.put(g(this.f20720m));
        byteBuffer.put(f(this.f20720m));
    }

    public byte[] s() {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        p(allocate);
        return allocate.array();
    }

    public String t() {
        char[] cArr = new char[24];
        int i10 = 0;
        for (byte b10 : s()) {
            int i11 = i10 + 1;
            char[] cArr2 = f20718u;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public String toString() {
        return t();
    }

    public ObjectId(Date date) {
        this(d(date), f20717t.getAndIncrement() & 16777215, false);
    }

    public ObjectId(Date date, int i10) {
        this(d(date), i10, true);
    }

    @Deprecated
    public ObjectId(Date date, int i10, short s10, int i11) {
        this(d(date), i10, s10, i11);
    }

    @Deprecated
    public ObjectId(int i10, int i11, short s10, int i12) {
        this(i10, i11, s10, i12, true);
    }

    public ObjectId(int i10, int i11) {
        this(i10, i11, true);
    }

    private ObjectId(int i10, int i11, boolean z10) {
        this(i10, f20715r, f20716s, i11, z10);
    }

    private ObjectId(int i10, int i11, short s10, int i12, boolean z10) {
        if ((i11 & (-16777216)) != 0) {
            throw new IllegalArgumentException("The machine identifier must be between 0 and 16777215 (it must fit in three bytes).");
        }
        if (z10 && (i12 & (-16777216)) != 0) {
            throw new IllegalArgumentException("The counter must be between 0 and 16777215 (it must fit in three bytes).");
        }
        this.f20719f = i10;
        this.f20720m = 16777215 & i12;
        this.f20721p = i11;
        this.f20722q = s10;
    }

    public ObjectId(String str) {
        this(o(str));
    }

    public ObjectId(byte[] bArr) {
        this(ByteBuffer.wrap((byte[]) a.a("bytes has length of 12", bArr, ((byte[]) a.c("bytes", bArr)).length == 12)));
    }

    ObjectId(int i10, int i11, int i12) {
        this(l(i10, i11, i12));
    }

    public ObjectId(ByteBuffer byteBuffer) {
        a.c("buffer", byteBuffer);
        a.b("buffer.remaining() >=12", byteBuffer.remaining() >= 12);
        this.f20719f = m(byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
        this.f20721p = m((byte) 0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
        this.f20722q = n(byteBuffer.get(), byteBuffer.get());
        this.f20720m = m((byte) 0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
    }
}
