package be.vinci.domain;

import java.util.Arrays;

public class Page {
    private int id;
    private String title;
    private String uri;
    private String content;
    private final static String[] POSSIBLE_PUBLICATION_STATUSES = {"hidden", "published"};
    private String publicationStatus;
    private User author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublicationStatus() {
        return publicationStatus;
    }

    public void setPublicationStatus(String publicationStatus) {
        this.publicationStatus = Arrays.stream(POSSIBLE_PUBLICATION_STATUSES).filter(possibleStatus -> possibleStatus.equals(publicationStatus)).findFirst()
                .orElse(null);
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Page page = (Page) o;

        return id == page.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Page [id=" + id + ", title=" + title + ", uri=" + uri + ", content=" + content + ", publicationStatus="
                + publicationStatus + ", author=" + author + "]";
    }


}
