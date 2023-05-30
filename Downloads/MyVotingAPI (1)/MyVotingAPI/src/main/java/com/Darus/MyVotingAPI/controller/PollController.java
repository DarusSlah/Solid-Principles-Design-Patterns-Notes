package com.Darus.MyVotingAPI.controller;

import com.Darus.MyVotingAPI.model.Poll;
import com.Darus.MyVotingAPI.service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
public class PollController {


    @Autowired
    private PollService pollService;




    @RequestMapping(value = "/polls", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Poll>> getAllPolls() {

        Iterable<Poll> allPolls = pollService.getAllPolls();
        return new ResponseEntity<>(pollService.getAllPolls(), HttpStatus.OK);
    }

    @RequestMapping(value = "/polls", method = RequestMethod.POST)
    public ResponseEntity<?> createPoll(@Validated @RequestBody Poll poll) {
        pollService.createPoll(poll);

        // Set the location header for the newly created resource
        HttpHeaders responseHeaders = new HttpHeaders();
        URI newPollUri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(poll.getId()).toUri();
        responseHeaders.setLocation(newPollUri);

        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/polls/{pollId}", method = RequestMethod.GET)
    public ResponseEntity<?> getPoll(@PathVariable Long pollId) {

        Optional<Poll> poll = pollService.getPoll(pollId);
        return new ResponseEntity<>(poll, HttpStatus.OK);


    }

    @PutMapping(value = "/polls/{pollId}")
    public ResponseEntity<Poll> updatePoll(@PathVariable Long pollId,@RequestBody Poll poll ) {
        // save entity
        Optional<Poll> existingPoll = pollService.getPoll(pollId);
        return ResponseEntity.ok(pollService.updatePoll(poll));
    }

    @RequestMapping(value = "/polls/{pollId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePoll(@PathVariable Long pollId) {
        pollService.deletePoll(pollId);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    }
