package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: f  reason: collision with root package name */
    private ResultReceiver f9065f;

    /* renamed from: m  reason: collision with root package name */
    private ResultReceiver f9066m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9067p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f9068q;

    private Intent a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private Intent b() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        int i10;
        super.onCreate(bundle);
        if (bundle == null) {
            zzb.zzi("ProxyBillingActivity", "Launching Play Store billing flow");
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.f9068q = true;
                    i10 = 110;
                }
                i10 = 100;
            } else {
                if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                    this.f9065f = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
                } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                    this.f9066m = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                    i10 = 101;
                } else {
                    pendingIntent = null;
                }
                i10 = 100;
            }
            try {
                this.f9067p = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i10, new Intent(), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e10) {
                zzb.zzk("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e10);
                ResultReceiver resultReceiver = this.f9065f;
                if (resultReceiver != null) {
                    resultReceiver.send(6, null);
                } else {
                    ResultReceiver resultReceiver2 = this.f9066m;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, null);
                    } else {
                        Intent b10 = b();
                        if (this.f9068q) {
                            b10.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        b10.putExtra("RESPONSE_CODE", 6);
                        b10.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(b10);
                    }
                }
                this.f9067p = false;
                finish();
                return;
            }
        }
        zzb.zzi("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
        this.f9067p = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
        if (bundle.containsKey("result_receiver")) {
            this.f9065f = (ResultReceiver) bundle.getParcelable("result_receiver");
        } else if (bundle.containsKey("in_app_message_result_receiver")) {
            this.f9066m = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
        }
        this.f9068q = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (!isFinishing() || !this.f9067p) {
            return;
        }
        Intent b10 = b();
        b10.putExtra("RESPONSE_CODE", 1);
        b10.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
        sendBroadcast(b10);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.f9065f;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f9066m;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f9067p);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f9068q);
    }
}
