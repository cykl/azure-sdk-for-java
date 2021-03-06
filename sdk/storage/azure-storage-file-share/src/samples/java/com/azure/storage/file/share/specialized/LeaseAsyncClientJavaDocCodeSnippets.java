// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.share.specialized;

import com.azure.storage.file.share.ShareFileClientBuilder;


public class LeaseAsyncClientJavaDocCodeSnippets {
    private ShareLeaseAsyncClient client = new ShareLeaseClientBuilder()
        .fileAsyncClient(new ShareFileClientBuilder().resourcePath("file").buildFileAsyncClient())
        .buildAsyncClient();

    /**
     * Code snippets for {@link ShareLeaseAsyncClient#acquireLease()}
     */
    public void acquireLeaseCodeSnippet() {
        // BEGIN: com.azure.storage.file.share.specialized.ShareLeaseAsyncClient.acquireLease
        client.acquireLease().subscribe(response -> System.out.printf("Lease ID is %s%n", response));
        // END: com.azure.storage.file.share.specialized.ShareLeaseAsyncClient.acquireLease
    }

    /**
     * Code snippets for {@link ShareLeaseAsyncClient#releaseLease()}
     */
    public void releaseLeaseCodeSnippet() {
        // BEGIN: com.azure.storage.file.share.specialized.ShareLeaseAsyncClient.releaseLease
        client.releaseLease().subscribe(response -> System.out.println("Completed release lease"));
        // END: com.azure.storage.file.share.specialized.ShareLeaseAsyncClient.releaseLease
    }

    /**
     * Code snippets for {@link ShareLeaseAsyncClient#breakLease()}
     */
    public void breakLeaseCodeSnippet() {
        // BEGIN: com.azure.storage.file.share.specialized.ShareLeaseAsyncClient.breakLease
        client.breakLease().subscribe(response ->
            System.out.println("The lease has been successfully broken"));
        // END: com.azure.storage.file.share.specialized.ShareLeaseAsyncClient.breakLease
    }

    /**
     * Code snippets for {@link ShareLeaseAsyncClient#changeLease(String)}
     */
    public void changeLeaseCodeSnippet() {
        // BEGIN: com.azure.storage.file.share.specialized.ShareLeaseAsyncClient.changeLease#String
        client.changeLease("proposedId").subscribe(response -> System.out.printf("Changed lease ID is %s%n", response));
        // END: com.azure.storage.file.share.specialized.ShareLeaseAsyncClient.changeLease#String
    }

    /**
     * Code snippets for {@link ShareLeaseAsyncClient#acquireLeaseWithResponse()}
     */
    public void acquireLeaseWithResponseCodeSnippets() {
        // BEGIN: com.azure.storage.file.share.specialized.ShareLeaseAsyncClient.acquireLeaseWithResponse
        client.acquireLeaseWithResponse().subscribe(response ->
            System.out.printf("Lease ID is %s%n", response.getValue()));
        // END: com.azure.storage.file.share.specialized.ShareLeaseAsyncClient.acquireLeaseWithResponse
    }

    /**
     * Code snippets for {@link ShareLeaseAsyncClient#releaseLeaseWithResponse()}
     */
    public void releaseLeaseWithResponseCodeSnippets() {
        // BEGIN: com.azure.storage.file.share.specialized.ShareLeaseAsyncClient.releaseLeaseWithResponse
        client.releaseLeaseWithResponse().subscribe(response ->
            System.out.printf("Release lease completed with status %d%n", response.getStatusCode()));
        // END: com.azure.storage.file.share.specialized.ShareLeaseAsyncClient.releaseLeaseWithResponse
    }

    /**
     * Code snippets for {@link ShareLeaseAsyncClient#breakLeaseWithResponse()}
     */
    public void breakLeaseWithResponseCodeSnippets() {
        // BEGIN: com.azure.storage.file.share.specialized.ShareLeaseAsyncClient.breakLeaseWithResponse
        client.breakLeaseWithResponse().subscribe(response ->
            System.out.println("The lease has been successfully broken"));
        // END: com.azure.storage.file.share.specialized.ShareLeaseAsyncClient.breakLeaseWithResponse
    }

    /**
     * Code snippets for {@link ShareLeaseAsyncClient#changeLeaseWithResponse(String)}
     */
    public void changeLeaseWithResponseCodeSnippets() {
        // BEGIN: com.azure.storage.file.share.specialized.ShareLeaseAsyncClient.changeLeaseWithResponse#String
        client.changeLeaseWithResponse("proposedId").subscribe(response ->
            System.out.printf("Changed lease ID is %s%n", response.getValue()));
        // END: com.azure.storage.file.share.specialized.ShareLeaseAsyncClient.changeLeaseWithResponse#String
    }
}
