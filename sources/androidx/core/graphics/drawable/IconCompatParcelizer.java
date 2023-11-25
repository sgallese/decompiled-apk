package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3882a = versionedParcel.p(iconCompat.f3882a, 1);
        iconCompat.f3884c = versionedParcel.j(iconCompat.f3884c, 2);
        iconCompat.f3885d = versionedParcel.r(iconCompat.f3885d, 3);
        iconCompat.f3886e = versionedParcel.p(iconCompat.f3886e, 4);
        iconCompat.f3887f = versionedParcel.p(iconCompat.f3887f, 5);
        iconCompat.f3888g = (ColorStateList) versionedParcel.r(iconCompat.f3888g, 6);
        iconCompat.f3890i = versionedParcel.t(iconCompat.f3890i, 7);
        iconCompat.f3891j = versionedParcel.t(iconCompat.f3891j, 8);
        iconCompat.p();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.q(versionedParcel.f());
        int i10 = iconCompat.f3882a;
        if (-1 != i10) {
            versionedParcel.F(i10, 1);
        }
        byte[] bArr = iconCompat.f3884c;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3885d;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i11 = iconCompat.f3886e;
        if (i11 != 0) {
            versionedParcel.F(i11, 4);
        }
        int i12 = iconCompat.f3887f;
        if (i12 != 0) {
            versionedParcel.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f3888g;
        if (colorStateList != null) {
            versionedParcel.H(colorStateList, 6);
        }
        String str = iconCompat.f3890i;
        if (str != null) {
            versionedParcel.J(str, 7);
        }
        String str2 = iconCompat.f3891j;
        if (str2 != null) {
            versionedParcel.J(str2, 8);
        }
    }
}
