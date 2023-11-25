package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class f1 extends OutputStream {

    /* renamed from: f  reason: collision with root package name */
    private final f2 f10797f = new f2();

    /* renamed from: m  reason: collision with root package name */
    private final File f10798m;

    /* renamed from: p  reason: collision with root package name */
    private final a3 f10799p;

    /* renamed from: q  reason: collision with root package name */
    private long f10800q;

    /* renamed from: r  reason: collision with root package name */
    private long f10801r;

    /* renamed from: s  reason: collision with root package name */
    private FileOutputStream f10802s;

    /* renamed from: t  reason: collision with root package name */
    private g3 f10803t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(File file, a3 a3Var) {
        this.f10798m = file;
        this.f10799p = a3Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        int min;
        while (i11 > 0) {
            if (this.f10800q == 0 && this.f10801r == 0) {
                int b10 = this.f10797f.b(bArr, i10, i11);
                if (b10 == -1) {
                    return;
                }
                i10 += b10;
                i11 -= b10;
                g3 c10 = this.f10797f.c();
                this.f10803t = c10;
                if (c10.d()) {
                    this.f10800q = 0L;
                    this.f10799p.l(this.f10803t.f(), 0, this.f10803t.f().length);
                    this.f10801r = this.f10803t.f().length;
                } else if (this.f10803t.h() && !this.f10803t.g()) {
                    this.f10799p.j(this.f10803t.f());
                    File file = new File(this.f10798m, this.f10803t.c());
                    file.getParentFile().mkdirs();
                    this.f10800q = this.f10803t.b();
                    this.f10802s = new FileOutputStream(file);
                } else {
                    byte[] f10 = this.f10803t.f();
                    this.f10799p.l(f10, 0, f10.length);
                    this.f10800q = this.f10803t.b();
                }
            }
            if (!this.f10803t.g()) {
                if (this.f10803t.d()) {
                    this.f10799p.e(this.f10801r, bArr, i10, i11);
                    this.f10801r += i11;
                    min = i11;
                } else if (this.f10803t.h()) {
                    min = (int) Math.min(i11, this.f10800q);
                    this.f10802s.write(bArr, i10, min);
                    long j10 = this.f10800q - min;
                    this.f10800q = j10;
                    if (j10 == 0) {
                        this.f10802s.close();
                    }
                } else {
                    min = (int) Math.min(i11, this.f10800q);
                    this.f10799p.e((this.f10803t.f().length + this.f10803t.b()) - this.f10800q, bArr, i10, min);
                    this.f10800q -= min;
                }
                i10 += min;
                i11 -= min;
            }
        }
    }
}
