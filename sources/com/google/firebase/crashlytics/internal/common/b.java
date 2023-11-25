package com.google.firebase.crashlytics.internal.common;

import java.io.File;

/* compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* loaded from: classes3.dex */
final class b extends p {

    /* renamed from: a  reason: collision with root package name */
    private final r8.b0 f11345a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11346b;

    /* renamed from: c  reason: collision with root package name */
    private final File f11347c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(r8.b0 b0Var, String str, File file) {
        if (b0Var != null) {
            this.f11345a = b0Var;
            if (str != null) {
                this.f11346b = str;
                if (file != null) {
                    this.f11347c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    @Override // com.google.firebase.crashlytics.internal.common.p
    public r8.b0 b() {
        return this.f11345a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.p
    public File c() {
        return this.f11347c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.p
    public String d() {
        return this.f11346b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f11345a.equals(pVar.b()) && this.f11346b.equals(pVar.d()) && this.f11347c.equals(pVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f11345a.hashCode() ^ 1000003) * 1000003) ^ this.f11346b.hashCode()) * 1000003) ^ this.f11347c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f11345a + ", sessionId=" + this.f11346b + ", reportFile=" + this.f11347c + "}";
    }
}
