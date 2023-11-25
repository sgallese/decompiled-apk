package x7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public abstract class m0 extends h0 implements n0 {
    public m0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // x7.h0
    protected final boolean J(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                A(parcel.readInt(), (Bundle) i0.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                zzb(parcel.readInt(), (Bundle) i0.a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                G(parcel.readInt(), (Bundle) i0.a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                d(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                I((Bundle) i0.a(parcel, creator), (Bundle) i0.a(parcel, creator));
                return true;
            case 7:
                zzd((Bundle) i0.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                r((Bundle) i0.a(parcel, creator2), (Bundle) i0.a(parcel, creator2));
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                u((Bundle) i0.a(parcel, creator3), (Bundle) i0.a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                w((Bundle) i0.a(parcel, creator4), (Bundle) i0.a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                b((Bundle) i0.a(parcel, creator5), (Bundle) i0.a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                l((Bundle) i0.a(parcel, creator6), (Bundle) i0.a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                j((Bundle) i0.a(parcel, creator7), (Bundle) i0.a(parcel, creator7));
                return true;
            case 15:
                o((Bundle) i0.a(parcel, Bundle.CREATOR));
                return true;
        }
    }
}
