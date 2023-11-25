package c3;

import java.nio.ByteBuffer;

/* compiled from: Table.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected int f8702a;

    /* renamed from: b  reason: collision with root package name */
    protected ByteBuffer f8703b;

    /* renamed from: c  reason: collision with root package name */
    private int f8704c;

    /* renamed from: d  reason: collision with root package name */
    private int f8705d;

    /* renamed from: e  reason: collision with root package name */
    d f8706e = d.a();

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(int i10) {
        return i10 + this.f8703b.getInt(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b(int i10) {
        if (i10 < this.f8705d) {
            return this.f8703b.getShort(this.f8704c + i10);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(int i10, ByteBuffer byteBuffer) {
        this.f8703b = byteBuffer;
        if (byteBuffer != null) {
            this.f8702a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f8704c = i11;
            this.f8705d = this.f8703b.getShort(i11);
            return;
        }
        this.f8702a = 0;
        this.f8704c = 0;
        this.f8705d = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int d(int i10) {
        int i11 = i10 + this.f8702a;
        return i11 + this.f8703b.getInt(i11) + 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(int i10) {
        int i11 = i10 + this.f8702a;
        return this.f8703b.getInt(i11 + this.f8703b.getInt(i11));
    }
}
