package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel.java */
/* loaded from: classes.dex */
class a extends VersionedParcel {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f7278d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f7279e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7280f;

    /* renamed from: g  reason: collision with root package name */
    private final int f7281g;

    /* renamed from: h  reason: collision with root package name */
    private final String f7282h;

    /* renamed from: i  reason: collision with root package name */
    private int f7283i;

    /* renamed from: j  reason: collision with root package name */
    private int f7284j;

    /* renamed from: k  reason: collision with root package name */
    private int f7285k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f7279e.writeInt(bArr.length);
            this.f7279e.writeByteArray(bArr);
            return;
        }
        this.f7279e.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f7279e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E(int i10) {
        this.f7279e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void G(Parcelable parcelable) {
        this.f7279e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void I(String str) {
        this.f7279e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i10 = this.f7283i;
        if (i10 >= 0) {
            int i11 = this.f7278d.get(i10);
            int dataPosition = this.f7279e.dataPosition();
            this.f7279e.setDataPosition(i11);
            this.f7279e.writeInt(dataPosition - i11);
            this.f7279e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel b() {
        Parcel parcel = this.f7279e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f7284j;
        if (i10 == this.f7280f) {
            i10 = this.f7281g;
        }
        return new a(parcel, dataPosition, i10, this.f7282h + "  ", this.f7275a, this.f7276b, this.f7277c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean g() {
        if (this.f7279e.readInt() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] i() {
        int readInt = this.f7279e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f7279e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f7279e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean m(int i10) {
        while (this.f7284j < this.f7281g) {
            int i11 = this.f7285k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f7279e.setDataPosition(this.f7284j);
            int readInt = this.f7279e.readInt();
            this.f7285k = this.f7279e.readInt();
            this.f7284j += readInt;
        }
        if (this.f7285k == i10) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int o() {
        return this.f7279e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T q() {
        return (T) this.f7279e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String s() {
        return this.f7279e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void w(int i10) {
        a();
        this.f7283i = i10;
        this.f7278d.put(i10, this.f7279e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y(boolean z10) {
        this.f7279e.writeInt(z10 ? 1 : 0);
    }

    private a(Parcel parcel, int i10, int i11, String str, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f7278d = new SparseIntArray();
        this.f7283i = -1;
        this.f7285k = -1;
        this.f7279e = parcel;
        this.f7280f = i10;
        this.f7281g = i11;
        this.f7284j = i10;
        this.f7282h = str;
    }
}
