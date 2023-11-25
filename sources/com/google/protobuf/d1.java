package com.google.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RawMessageInfo.java */
/* loaded from: classes3.dex */
public final class d1 implements o0 {

    /* renamed from: a  reason: collision with root package name */
    private final q0 f12272a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12273b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f12274c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12275d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(q0 q0Var, String str, Object[] objArr) {
        String str2;
        Throwable e10;
        char charAt;
        this.f12272a = q0Var;
        this.f12273b = str;
        this.f12274c = objArr;
        int i10 = 1;
        try {
            charAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str3 = new String(charArray);
            try {
                try {
                    charAt = str3.charAt(0);
                    str = str3;
                } catch (StringIndexOutOfBoundsException unused2) {
                    char[] cArr = new char[str3.length()];
                    str3.getChars(0, str3.length(), cArr, 0);
                    str2 = new String(cArr);
                    try {
                        charAt = str2.charAt(0);
                        str = str2;
                    } catch (ArrayIndexOutOfBoundsException e11) {
                        e10 = e11;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e10);
                    } catch (StringIndexOutOfBoundsException e12) {
                        e10 = e12;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e10);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e13) {
                str2 = str3;
                e10 = e13;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e10);
            }
        }
        if (charAt < 55296) {
            this.f12275d = charAt;
            return;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 >= 55296) {
                i11 |= (charAt2 & 8191) << i12;
                i12 += 13;
                i10 = i13;
            } else {
                this.f12275d = (charAt2 << i12) | i11;
                return;
            }
        }
    }

    @Override // com.google.protobuf.o0
    public boolean a() {
        if ((this.f12275d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.o0
    public q0 b() {
        return this.f12272a;
    }

    @Override // com.google.protobuf.o0
    public a1 c() {
        if ((this.f12275d & 1) == 1) {
            return a1.PROTO2;
        }
        return a1.PROTO3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] d() {
        return this.f12274c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.f12273b;
    }
}
