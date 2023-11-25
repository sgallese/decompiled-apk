package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MetadataListReader.java */
/* loaded from: classes.dex */
class m {

    /* compiled from: MetadataListReader.java */
    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f4440a;

        a(ByteBuffer byteBuffer) {
            this.f4440a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.m.c
        public int a() throws IOException {
            return this.f4440a.getInt();
        }

        @Override // androidx.emoji2.text.m.c
        public void b(int i10) throws IOException {
            ByteBuffer byteBuffer = this.f4440a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // androidx.emoji2.text.m.c
        public long c() throws IOException {
            return m.c(this.f4440a.getInt());
        }

        @Override // androidx.emoji2.text.m.c
        public long getPosition() {
            return this.f4440a.position();
        }

        @Override // androidx.emoji2.text.m.c
        public int readUnsignedShort() throws IOException {
            return m.d(this.f4440a.getShort());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MetadataListReader.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final long f4441a;

        /* renamed from: b  reason: collision with root package name */
        private final long f4442b;

        b(long j10, long j11) {
            this.f4441a = j10;
            this.f4442b = j11;
        }

        long a() {
            return this.f4441a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MetadataListReader.java */
    /* loaded from: classes.dex */
    public interface c {
        int a() throws IOException;

        void b(int i10) throws IOException;

        long c() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    private static b a(c cVar) throws IOException {
        long j10;
        cVar.b(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            cVar.b(6);
            int i10 = 0;
            while (true) {
                if (i10 < readUnsignedShort) {
                    int a10 = cVar.a();
                    cVar.b(4);
                    j10 = cVar.c();
                    cVar.b(4);
                    if (1835365473 == a10) {
                        break;
                    }
                    i10++;
                } else {
                    j10 = -1;
                    break;
                }
            }
            if (j10 != -1) {
                cVar.b((int) (j10 - cVar.getPosition()));
                cVar.b(12);
                long c10 = cVar.c();
                for (int i11 = 0; i11 < c10; i11++) {
                    int a11 = cVar.a();
                    long c11 = cVar.c();
                    long c12 = cVar.c();
                    if (1164798569 == a11 || 1701669481 == a11) {
                        return new b(c11 + j10, c12);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c3.b b(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return c3.b.h(duplicate);
    }

    static long c(int i10) {
        return i10 & 4294967295L;
    }

    static int d(short s10) {
        return s10 & 65535;
    }
}
