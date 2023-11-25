package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import qc.h;
import qc.q;

/* compiled from: IntentSenderRequest.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {

    /* renamed from: f  reason: collision with root package name */
    private final IntentSender f675f;

    /* renamed from: m  reason: collision with root package name */
    private final Intent f676m;

    /* renamed from: p  reason: collision with root package name */
    private final int f677p;

    /* renamed from: q  reason: collision with root package name */
    private final int f678q;

    /* renamed from: r  reason: collision with root package name */
    public static final c f674r = new c(null);
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new b();

    /* compiled from: IntentSenderRequest.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final IntentSender f679a;

        /* renamed from: b  reason: collision with root package name */
        private Intent f680b;

        /* renamed from: c  reason: collision with root package name */
        private int f681c;

        /* renamed from: d  reason: collision with root package name */
        private int f682d;

        public a(IntentSender intentSender) {
            q.i(intentSender, "intentSender");
            this.f679a = intentSender;
        }

        public final IntentSenderRequest a() {
            return new IntentSenderRequest(this.f679a, this.f680b, this.f681c, this.f682d);
        }

        public final a b(Intent intent) {
            this.f680b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f682d = i10;
            this.f681c = i11;
            return this;
        }
    }

    /* compiled from: IntentSenderRequest.kt */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<IntentSenderRequest> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            q.i(parcel, "inParcel");
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i10) {
            return new IntentSenderRequest[i10];
        }
    }

    /* compiled from: IntentSenderRequest.kt */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(h hVar) {
            this();
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11) {
        q.i(intentSender, "intentSender");
        this.f675f = intentSender;
        this.f676m = intent;
        this.f677p = i10;
        this.f678q = i11;
    }

    public final Intent a() {
        return this.f676m;
    }

    public final int b() {
        return this.f677p;
    }

    public final int c() {
        return this.f678q;
    }

    public final IntentSender d() {
        return this.f675f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        q.i(parcel, "dest");
        parcel.writeParcelable(this.f675f, i10);
        parcel.writeParcelable(this.f676m, i10);
        parcel.writeInt(this.f677p);
        parcel.writeInt(this.f678q);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IntentSenderRequest(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            qc.q.i(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            qc.q.f(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.IntentSenderRequest.<init>(android.os.Parcel):void");
    }
}
