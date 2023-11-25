package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.k0;
import androidx.lifecycle.p;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();
    final boolean A;

    /* renamed from: f  reason: collision with root package name */
    final int[] f4527f;

    /* renamed from: m  reason: collision with root package name */
    final ArrayList<String> f4528m;

    /* renamed from: p  reason: collision with root package name */
    final int[] f4529p;

    /* renamed from: q  reason: collision with root package name */
    final int[] f4530q;

    /* renamed from: r  reason: collision with root package name */
    final int f4531r;

    /* renamed from: s  reason: collision with root package name */
    final String f4532s;

    /* renamed from: t  reason: collision with root package name */
    final int f4533t;

    /* renamed from: u  reason: collision with root package name */
    final int f4534u;

    /* renamed from: v  reason: collision with root package name */
    final CharSequence f4535v;

    /* renamed from: w  reason: collision with root package name */
    final int f4536w;

    /* renamed from: x  reason: collision with root package name */
    final CharSequence f4537x;

    /* renamed from: y  reason: collision with root package name */
    final ArrayList<String> f4538y;

    /* renamed from: z  reason: collision with root package name */
    final ArrayList<String> f4539z;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<BackStackRecordState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i10) {
            return new BackStackRecordState[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BackStackRecordState(androidx.fragment.app.a aVar) {
        int size = aVar.f4733c.size();
        this.f4527f = new int[size * 6];
        if (aVar.f4739i) {
            this.f4528m = new ArrayList<>(size);
            this.f4529p = new int[size];
            this.f4530q = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                k0.a aVar2 = aVar.f4733c.get(i10);
                int i12 = i11 + 1;
                this.f4527f[i11] = aVar2.f4750a;
                ArrayList<String> arrayList = this.f4528m;
                Fragment fragment = aVar2.f4751b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f4527f;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.f4752c ? 1 : 0;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f4753d;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f4754e;
                int i16 = i15 + 1;
                iArr[i15] = aVar2.f4755f;
                iArr[i16] = aVar2.f4756g;
                this.f4529p[i10] = aVar2.f4757h.ordinal();
                this.f4530q[i10] = aVar2.f4758i.ordinal();
                i10++;
                i11 = i16 + 1;
            }
            this.f4531r = aVar.f4738h;
            this.f4532s = aVar.f4741k;
            this.f4533t = aVar.f4660v;
            this.f4534u = aVar.f4742l;
            this.f4535v = aVar.f4743m;
            this.f4536w = aVar.f4744n;
            this.f4537x = aVar.f4745o;
            this.f4538y = aVar.f4746p;
            this.f4539z = aVar.f4747q;
            this.A = aVar.f4748r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    private void a(androidx.fragment.app.a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 < this.f4527f.length) {
                k0.a aVar2 = new k0.a();
                int i12 = i10 + 1;
                aVar2.f4750a = this.f4527f[i10];
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f4527f[i12]);
                }
                aVar2.f4757h = p.b.values()[this.f4529p[i11]];
                aVar2.f4758i = p.b.values()[this.f4530q[i11]];
                int[] iArr = this.f4527f;
                int i13 = i12 + 1;
                if (iArr[i12] == 0) {
                    z10 = false;
                }
                aVar2.f4752c = z10;
                int i14 = i13 + 1;
                int i15 = iArr[i13];
                aVar2.f4753d = i15;
                int i16 = i14 + 1;
                int i17 = iArr[i14];
                aVar2.f4754e = i17;
                int i18 = i16 + 1;
                int i19 = iArr[i16];
                aVar2.f4755f = i19;
                int i20 = iArr[i18];
                aVar2.f4756g = i20;
                aVar.f4734d = i15;
                aVar.f4735e = i17;
                aVar.f4736f = i19;
                aVar.f4737g = i20;
                aVar.f(aVar2);
                i11++;
                i10 = i18 + 1;
            } else {
                aVar.f4738h = this.f4531r;
                aVar.f4741k = this.f4532s;
                aVar.f4739i = true;
                aVar.f4742l = this.f4534u;
                aVar.f4743m = this.f4535v;
                aVar.f4744n = this.f4536w;
                aVar.f4745o = this.f4537x;
                aVar.f4746p = this.f4538y;
                aVar.f4747q = this.f4539z;
                aVar.f4748r = this.A;
                return;
            }
        }
    }

    public androidx.fragment.app.a b(FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        aVar.f4660v = this.f4533t;
        for (int i10 = 0; i10 < this.f4528m.size(); i10++) {
            String str = this.f4528m.get(i10);
            if (str != null) {
                aVar.f4733c.get(i10).f4751b = fragmentManager.g0(str);
            }
        }
        aVar.y(1);
        return aVar;
    }

    public androidx.fragment.app.a c(FragmentManager fragmentManager, Map<String, Fragment> map) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        for (int i10 = 0; i10 < this.f4528m.size(); i10++) {
            String str = this.f4528m.get(i10);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment != null) {
                    aVar.f4733c.get(i10).f4751b = fragment;
                } else {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f4532s + " failed due to missing saved state for Fragment (" + str + ")");
                }
            }
        }
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f4527f);
        parcel.writeStringList(this.f4528m);
        parcel.writeIntArray(this.f4529p);
        parcel.writeIntArray(this.f4530q);
        parcel.writeInt(this.f4531r);
        parcel.writeString(this.f4532s);
        parcel.writeInt(this.f4533t);
        parcel.writeInt(this.f4534u);
        TextUtils.writeToParcel(this.f4535v, parcel, 0);
        parcel.writeInt(this.f4536w);
        TextUtils.writeToParcel(this.f4537x, parcel, 0);
        parcel.writeStringList(this.f4538y);
        parcel.writeStringList(this.f4539z);
        parcel.writeInt(this.A ? 1 : 0);
    }

    BackStackRecordState(Parcel parcel) {
        this.f4527f = parcel.createIntArray();
        this.f4528m = parcel.createStringArrayList();
        this.f4529p = parcel.createIntArray();
        this.f4530q = parcel.createIntArray();
        this.f4531r = parcel.readInt();
        this.f4532s = parcel.readString();
        this.f4533t = parcel.readInt();
        this.f4534u = parcel.readInt();
        this.f4535v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4536w = parcel.readInt();
        this.f4537x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4538y = parcel.createStringArrayList();
        this.f4539z = parcel.createStringArrayList();
        this.A = parcel.readInt() != 0;
    }
}
