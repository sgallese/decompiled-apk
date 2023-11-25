package ld;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import okio.r0;
import qc.q;

/* compiled from: ZipEntry.kt */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final r0 f19660a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f19661b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19662c;

    /* renamed from: d  reason: collision with root package name */
    private final long f19663d;

    /* renamed from: e  reason: collision with root package name */
    private final long f19664e;

    /* renamed from: f  reason: collision with root package name */
    private final long f19665f;

    /* renamed from: g  reason: collision with root package name */
    private final int f19666g;

    /* renamed from: h  reason: collision with root package name */
    private final Long f19667h;

    /* renamed from: i  reason: collision with root package name */
    private final long f19668i;

    /* renamed from: j  reason: collision with root package name */
    private final List<r0> f19669j;

    public d(r0 r0Var, boolean z10, String str, long j10, long j11, long j12, int i10, Long l10, long j13) {
        q.i(r0Var, "canonicalPath");
        q.i(str, "comment");
        this.f19660a = r0Var;
        this.f19661b = z10;
        this.f19662c = str;
        this.f19663d = j10;
        this.f19664e = j11;
        this.f19665f = j12;
        this.f19666g = i10;
        this.f19667h = l10;
        this.f19668i = j13;
        this.f19669j = new ArrayList();
    }

    public final r0 a() {
        return this.f19660a;
    }

    public final List<r0> b() {
        return this.f19669j;
    }

    public final long c() {
        return this.f19664e;
    }

    public final int d() {
        return this.f19666g;
    }

    public final Long e() {
        return this.f19667h;
    }

    public final long f() {
        return this.f19668i;
    }

    public final long g() {
        return this.f19665f;
    }

    public final boolean h() {
        return this.f19661b;
    }

    public /* synthetic */ d(r0 r0Var, boolean z10, String str, long j10, long j11, long j12, int i10, Long l10, long j13, int i11, qc.h hVar) {
        this(r0Var, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? "" : str, (i11 & 8) != 0 ? -1L : j10, (i11 & 16) != 0 ? -1L : j11, (i11 & 32) != 0 ? -1L : j12, (i11 & 64) != 0 ? -1 : i10, (i11 & 128) != 0 ? null : l10, (i11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? j13 : -1L);
    }
}
