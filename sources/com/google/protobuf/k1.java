package com.google.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextFormatEscaper.java */
/* loaded from: classes3.dex */
public final class k1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFormatEscaper.java */
    /* loaded from: classes3.dex */
    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f12371a;

        a(h hVar) {
            this.f12371a = hVar;
        }

        @Override // com.google.protobuf.k1.b
        public byte a(int i10) {
            return this.f12371a.e(i10);
        }

        @Override // com.google.protobuf.k1.b
        public int size() {
            return this.f12371a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextFormatEscaper.java */
    /* loaded from: classes3.dex */
    public interface b {
        byte a(int i10);

        int size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(h hVar) {
        return b(new a(hVar));
    }

    static String b(b bVar) {
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            byte a10 = bVar.a(i10);
            if (a10 != 34) {
                if (a10 != 39) {
                    if (a10 != 92) {
                        switch (a10) {
                            case 7:
                                sb2.append("\\a");
                                continue;
                            case 8:
                                sb2.append("\\b");
                                continue;
                            case 9:
                                sb2.append("\\t");
                                continue;
                            case 10:
                                sb2.append("\\n");
                                continue;
                            case 11:
                                sb2.append("\\v");
                                continue;
                            case 12:
                                sb2.append("\\f");
                                continue;
                            case 13:
                                sb2.append("\\r");
                                continue;
                            default:
                                if (a10 >= 32 && a10 <= 126) {
                                    sb2.append((char) a10);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((a10 >>> 6) & 3) + 48));
                                    sb2.append((char) (((a10 >>> 3) & 7) + 48));
                                    sb2.append((char) ((a10 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str) {
        return a(h.i(str));
    }
}
