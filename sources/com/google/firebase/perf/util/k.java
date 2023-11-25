package com.google.firebase.perf.util;

import okhttp3.internal.ws.RealWebSocket;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StorageUnit.java */
/* loaded from: classes3.dex */
public abstract class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k BYTES;
    public static final k GIGABYTES;
    public static final k KILOBYTES;
    public static final k MEGABYTES;
    public static final k TERABYTES;
    long numBytes;

    /* compiled from: StorageUnit.java */
    /* loaded from: classes3.dex */
    enum a extends k {
        a(String str, int i10, long j10) {
            super(str, i10, j10, null);
        }

        @Override // com.google.firebase.perf.util.k
        public long convert(long j10, k kVar) {
            return kVar.toTerabytes(j10);
        }
    }

    static {
        a aVar = new a("TERABYTES", 0, 1099511627776L);
        TERABYTES = aVar;
        k kVar = new k("GIGABYTES", 1, 1073741824L) { // from class: com.google.firebase.perf.util.k.b
            {
                a aVar2 = null;
            }

            @Override // com.google.firebase.perf.util.k
            public long convert(long j10, k kVar2) {
                return kVar2.toGigabytes(j10);
            }
        };
        GIGABYTES = kVar;
        k kVar2 = new k("MEGABYTES", 2, 1048576L) { // from class: com.google.firebase.perf.util.k.c
            {
                a aVar2 = null;
            }

            @Override // com.google.firebase.perf.util.k
            public long convert(long j10, k kVar3) {
                return kVar3.toMegabytes(j10);
            }
        };
        MEGABYTES = kVar2;
        k kVar3 = new k("KILOBYTES", 3, RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) { // from class: com.google.firebase.perf.util.k.d
            {
                a aVar2 = null;
            }

            @Override // com.google.firebase.perf.util.k
            public long convert(long j10, k kVar4) {
                return kVar4.toKilobytes(j10);
            }
        };
        KILOBYTES = kVar3;
        k kVar4 = new k("BYTES", 4, 1L) { // from class: com.google.firebase.perf.util.k.e
            {
                a aVar2 = null;
            }

            @Override // com.google.firebase.perf.util.k
            public long convert(long j10, k kVar5) {
                return kVar5.toBytes(j10);
            }
        };
        BYTES = kVar4;
        $VALUES = new k[]{aVar, kVar, kVar2, kVar3, kVar4};
    }

    /* synthetic */ k(String str, int i10, long j10, a aVar) {
        this(str, i10, j10);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public abstract long convert(long j10, k kVar);

    public long toBytes(long j10) {
        return j10 * this.numBytes;
    }

    public long toGigabytes(long j10) {
        return (j10 * this.numBytes) / GIGABYTES.numBytes;
    }

    public long toKilobytes(long j10) {
        return (j10 * this.numBytes) / KILOBYTES.numBytes;
    }

    public long toMegabytes(long j10) {
        return (j10 * this.numBytes) / MEGABYTES.numBytes;
    }

    public long toTerabytes(long j10) {
        return (j10 * this.numBytes) / TERABYTES.numBytes;
    }

    private k(String str, int i10, long j10) {
        this.numBytes = j10;
    }
}
